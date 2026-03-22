using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(program7_student_login.Startup))]
namespace program7_student_login
{
    public partial class Startup {
        public void Configuration(IAppBuilder app) {
            ConfigureAuth(app);
        }
    }
}
